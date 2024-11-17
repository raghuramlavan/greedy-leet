class varArray{
    static void printArr(int ...para){
        for( int j: para)
            System.out.println(j);
    }

    public static void main(String args[]){
        printArr(1,2,3);
        printArr(1,2,3,4,5,6);
    }
}
