package org.project;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class responsible for displaying output on screen and writing TXT output file
 */

public class OutputDisplay {

    /**
     * Displaying projects list
     */

    public static void Display(HashMap<String, ArrayList<String>> projectList) {

        for (String key : projectList.keySet()) {

            System.out.print(key + " ");
            ArrayList<String> projectLanguages = projectList.get(key);

            for (String language : projectLanguages) {
                System.out.print(language + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Displaying programmers list
     */

    public static void DevDisplay(ArrayList<Programmer> devList) {

        for (Programmer s : devList) {
            System.out.println(s.id + " " + s.roles);
        }
        System.out.println();

    }
}
