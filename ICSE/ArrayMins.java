/* 
 * def print2Smallest(arr):
 
    # There should be atleast two elements
    arr_size = len(arr)
    if arr_size < 2:
        print "Invalid Input"
        return
 
    first = second = sys.maxint
    for i in range(0, arr_size):
 
        # If current element is smaller than first then
        # update both first and second
        if arr[i] < first:
            second = first
            first = arr[i]
 
        # If arr[i] is in between first and second then
        # update second
        elif (arr[i] < second and arr[i] != first):
            second = arr[i];
 
    if (second == sys.maxint):
        print "No second smallest element"
    else:
        print 'The smallest element is',first,'and' \
              ' second smallest element is',second
 
# Driver function to test above function
arr = [12, 13, 1, 10, 34, 1]
print2Smallest(arr)
   
   */
  class ArrayMins{
   static void print2Smallest(int arr[])
    {
        int first, second, arr_size = arr.length;
 
        /* There should be atleast two elements */
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
 
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* If current element is smaller than first
              then update both first and second */
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and second
               then update second  */
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                               "smallest element");
        else
            System.out.println("The smallest element is " +
                               first + " and second Smallest" +
                               " element is " + second);
    }
 
    /* Driver program to test above functions */
    public static void main (String[] args)
    {
        int arr[] = {12, 13, 1, 10, 34, 1};
        print2Smallest(arr);
    }
}