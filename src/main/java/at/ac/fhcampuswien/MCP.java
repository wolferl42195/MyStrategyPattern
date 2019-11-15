package at.ac.fhcampuswien;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class MCP {

    private static List<Class> getClassesForPackage(String pckgname) throws ClassNotFoundException {
        ArrayList<File> directories = new ArrayList<File>();
        try {
            ClassLoader cld = Thread.currentThread().getContextClassLoader();
            if (cld == null) {
                throw new ClassNotFoundException("Can't get class loader.");
            }
            String path = pckgname.replace('.', '/');
            Enumeration<URL> resources = cld.getResources(path);
            while (resources.hasMoreElements()) {
                directories.add(new File(URLDecoder.decode(resources.nextElement().getPath(), "UTF-8")));
            }
        } catch (NullPointerException x) {
            throw new ClassNotFoundException(pckgname + " does not appear to be a valid package (Null pointer exception)");
        } catch (UnsupportedEncodingException encex) {
            throw new ClassNotFoundException(pckgname + " does not appear to be a valid package (Unsupported encoding)");
        } catch (IOException ioex) {
            throw new ClassNotFoundException("IOException was thrown when trying to get all resources for " + pckgname);
        }

        ArrayList<Class> classes = new ArrayList<>();
        for (File directory : directories) {
            if (directory.exists()) {
                String[] files = directory.list();
                for (String file : files) {
                    if (file.endsWith(".class")) {
                        try {
                            classes.add(Class.forName(pckgname + '.' + file.substring(0, file.length() - 6)));
                        } catch (NoClassDefFoundError e) {
                        }
                    }
                }
            } else {
                throw new ClassNotFoundException(pckgname + " (" + directory.getPath() + ") does not appear to be a valid package");
            }
        }
        return classes;
    }

    public static void main(String args[]) {
        try {
            List<Class> list = getClassesForPackage("at.ac.fhcampuswien.students");
            for (Class c : list) {
                Class<?> unknwonClass = Class.forName(c.getName());
                Student s = (Student) unknwonClass.newInstance();
                System.out.println(s.getName()+": "+s.getMyFavoriteQuote());
            }
        } catch (Exception e) {
            System.err.println("Problem occurred: "+e.getMessage());
        }
    }
}
