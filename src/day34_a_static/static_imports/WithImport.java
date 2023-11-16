package day34_a_static.static_imports;


// This line of code, IMPORTS all the static members of the Arrays class

import static java.util.Arrays.*;

import static java.lang.Math.*;

import static my_utilities.StringUtil.*;
    public class WithImport {
        public static void main(String[] args) {

            int [] a = {2, 30, 5, 65, 7};

            sort(a);



            System.out.println(PI);

            System.out.println(reverse("loop"));



        }

    }


