class Demo{
    final String  instanceField1 = "initialized at declaration";

    final String instanceField2 ; //blank variable

    {
        instanceField2 = "initialized in instance initializer block";
    }

    final static String staticField1 =  "initialized at declaration"; //compile time constant   (primitive type only or string)

    final static String staticField2 ;

    static {
        staticField2 = "initialized in static initializer block";
    }
    final String instanceField3;
//    final static String staticField3;
    public Demo(){
        instanceField3 = "initialized in constructor";
//        staticField3 = "initialized in constructor"; not allowd
    }

    public void instanceMethod(){
        final int x;
        x = 10; //first initialization allowed
//        x = 20; //second change not allowed

    }

    public void instanceMethod2(final int x){

//        x = 10; //changing final paramter value not alloed

    }
    public final void finalInstanceMethod(){
        System.out.printf("\n finalInstanceMethod\n");
    }


}