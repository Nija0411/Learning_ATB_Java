package ex_lab.lab005_strings;

class StringBufferEx {
    //Only 1 object will remain in Heap Area --> emocleWolleh
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("Welcome");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("ATB");
        stringBuilder.append(123);
        System.out.println(stringBuilder);//Internally, it converts the integer to a string and appends it. That’s why it works perfectly and prints ATB123.
    }
}
