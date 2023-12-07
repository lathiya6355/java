//  abstaract method

class Second {
        public static void main(String args[]){ 
            Student myObj = new Student();
            System.out.println("name :" + myObj.fname);
            System.out.println("age :" + myObj.age);
            System.out.println("graduation year :" + myObj.graduationYear);
            myObj.study();
        }
    }

