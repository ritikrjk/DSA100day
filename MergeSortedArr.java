/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class MergeSortedArr
{
  static void displayResult (int arr3[])
  {
    for (int i = 0; i < arr3.length; i++)
      {
	System.out.print (arr3[i] + " ");
      }
  }

  public static void main (String[]args)
  {


    int arr1[] = { 1, 3, 5, 7 };
    int arr2[] = { 0, 2, 6, 8, 9 };


    int arr3[] = new int[arr1.length + arr2.length];

    int chk_1 = 0, chk_2 = 0, index = 0;

    while (chk_1 < arr1.length && chk_2 < arr2.length)
      {

	if (arr1[chk_1] >= arr2[chk_2])
	  {
	    arr3[index] = arr2[chk_2];
	    index++;
	    chk_2++;
	  }
	else
	  {
	    arr3[index] = arr1[chk_1];
	    index++;
	    chk_1++;
	  }
      }


    while (chk_1 < arr1.length)
      {
	arr3[index] = arr1[chk_1];
	index++;
	chk_1++;
      }

    while (chk_2 < arr2.length)
      {
	arr3[index] = arr2[chk_2];
	index++;
	chk_2++;
      }
    displayResult (arr3);

  }
}
