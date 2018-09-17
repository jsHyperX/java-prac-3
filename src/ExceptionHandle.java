public class ExceptionHandle {

    public ExceptionHandle() {}

    public void handler() {
        try{
            int[] a = new int[4];
            System.out.println(a[4]);
        }
        catch(IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("invalid index access attempt found....");
        }

        try{
            int[] a=null;
            System.out.println(a[0]);
        }
        catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("unallocated memory access attempt found...");
        }

        try{
            int[] a = new int[-1];
        }
        catch(NegativeArraySizeException e) {
            e.printStackTrace();
            System.out.println("array size cannot be negetive...");
        }
    }
}
