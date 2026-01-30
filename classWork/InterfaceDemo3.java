interface Demo      
{
    int no = 11;       // by default public static final
    void Display();    // public   abstract

}

class hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Display ");
    }


}

class InterfaceDemo3
{

    public static void main(String A[])
    {
        System.out.println(Demo.no); //no is public and static
        // Demo.no = 12;             // no is final
        hello hobj = new hello();  

        hobj.Display();

    }
}