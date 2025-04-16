package ex_lab.lab007_class_objects;

class ClassDemo {
    public static void main(String[] args) {
        System.out.println("Hello From Class Demo");
    }
}

class C1{}
class C2{}
//class 123{} Compile error
class $123{}
class _123{}
//class _123{} duplicates are not allowed
class C3{};
//class a b{} with space not allowed

class C4{

    class C5{

        class C6{

            class C7{

                class C8{
                    //We can create n number of inner classes
                }
            }
        }
    }
}

class C8{
    public static void main(String[] args) {
        System.out.println("Hello From C8");
    }
}


