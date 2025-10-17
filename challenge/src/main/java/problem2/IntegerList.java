package problem2;

public class IntegerList {
    int[] list; //values in the list
    private int numCurrElementsList;
    private int CurrArraySize;// we choose the size od the array to be initially 5

    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    // size given to the constructor is the initiall size of the array
    public IntegerList(int size) {
        list = new int[size]; //all elements of list ar e initialized to 0
        CurrArraySize = size;
        numCurrElementsList = 0;

    }

    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize() {
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100) + 1;
        numCurrElementsList = list.length;

    }

    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print() {
        for (int i = 0; i < list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
//Increase the size of the list
//-------------------------------------------------------
    public void increaseSize() {
        int[] newArray = new int[list.length * 2];
        CurrArraySize = newArray.length;
        for (int i = 0; i < list.length; i++) {
            newArray[i] = list[i];


        }
        list=newArray;



    }
    public void addElement(int newVal){
        //check if the array is full


        if (CurrArraySize==numCurrElementsList){
            increaseSize();


        }
        list[numCurrElementsList] = newVal;
        numCurrElementsList ++;





    }
    void removeFirst(int newVal) {
        int newVal_Index=0;

        for (int i=0;i<list.length;i++){
            if (list[i]==newVal){
                newVal_Index=i;
                break;

            }
        }
        for (int i=newVal_Index;i<list.length-1;i++){
            list[i]=list[i+1];

        }
        list[list.length-1]=0;
        numCurrElementsList--;


    }
    //remove all the occurence:
    void removeAll(int newVal){


        for (int i=0;i<list.length;i++){
            if (list[i]==newVal){
                for (int j=i;j<list.length-1;j++){
                    list[j]=list[j+1];

                }
                list[list.length-1]=0;
                numCurrElementsList--;
                i--;


            }
        }




    }
}