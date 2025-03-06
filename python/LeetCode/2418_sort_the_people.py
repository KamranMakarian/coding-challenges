class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        new_dict = {heights[i]: names[i] for i in range(len(heights))}
        new_dict_sorted = dict(sorted(new_dict.items(), reverse = True))

        return(list(new_dict_sorted.values()))

"""

Time Complexity:

Dictionary Creation (new_dict): O(n)
Creates a dictionary by iterating through heights and names.

Sorting (new_dict_sorted): O(n log n)
Sorting the dictionary items by keys (heights) in descending order.

Extracting Values (list()): O(n)
Converts the dictionary values to a list.

Overall Time Complexity:
O(n) + O(n log n) + O(n) = O(n log n)

Space Complexity:

Dictionary (new_dict): O(n)
The dictionary temporarily stores all elements.

Sorted Dictionary (new_dict_sorted): O(n)
Creates another dictionary during sorting.

List of Values (list()): O(n)
Returns a list of names, which is an additional structure.

Overall Space Complexity: O(n)
The main memory usage is for the dictionary and the list.


# Alternative Solution:
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        # Create a list of (height, name) pairs
        paired_list = zip(heights, names)
        
        # Sort by height in descending order and extract the names
        sorted_names = [name for _, name in sorted(paired_list, reverse=True)]
        
        return sorted_names

Time Complexity:

Zipping (zip()): O(n)
Creates a list of tuples ((height, name)) in a linear pass.

Sorting (sorted()): O(n log n)
Sorts the tuples by the first element (height) in descending order.

List Comprehension: O(n)
Extracts names from the sorted tuples.

Overall Time Complexity:
O(n) + O(n log n) + O(n) = O(n log n)

Space Complexity: O(n)

Paired List (zip()): O(n)
zip() creates an iterable that consumes minimal additional memory.

Sorted Names List: O(n)
The final list of names also takes O(n) space.

Overall Space Complexity: O(n)
Uses slightly less intermediate memory since it does not store an extra dictionary.
"""