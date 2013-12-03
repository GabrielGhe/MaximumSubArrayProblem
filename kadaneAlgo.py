'''
Maximum_subarray_problem

Summary:
Given an array, it will computer the value
of the largest subarray, it doesn't keep track
of the indices though
'''
def max_sub(Array):
    
    #set default values of accumulators to first element
    max_ending_here = max_so_far = Array[0]
    
    #iterate through array
    for val in Array:
        
        #get the ending_here accumulator and add val
        #if the new value is negative, set it to 0
        max_ending_here = max(0, max_ending_here + val)
        
        #get the bigger value out of the accumulator so far
        #and the ending_here value
        max_so_far = max(max_so_far, max_ending_here)
        
    #the value returned will be the maximum sum
    #it found that's bigger than 0
    return max_so_far

ranArray = [-1,2,3,-4,5,6,7,-3,-1]
max_subarray(ranArray)
