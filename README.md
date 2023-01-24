#Java Apprentice Course

Java Exceptions
>* When building a Java application of any complexity. One must account for thefact that it's execution will not always go smoothly, sooner or later, some error will be encountered and Java's way of handling this is to quote unquote, throw an exception.

>* catching and handling such exception is something which is required to ensure that Java program continues to run even when error are encountered and that is precisely the focus of this learning path.

>* Checked exceptions which can be identified at the compile stage.

>* Unchecked exceptions which come up while the program is running.

What is an exception
>* An event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions

Checked exceptions
>* detected by the compiler , and need to be handled by the developer
>* need to be specified or handle with a try-catch block

Unchecked exceptions
>* not pointed out by the compiler - but a good developer should anticipate and handle them
>* can be addressed by fixing bugs in the code or by setting a try-catch block

Java Collections Framework
>* classes and interface that implement commonly reusable data structures
>* Collection interface represents a group of objects, known as its elements. List and Set interfaces extends Collection, List interface allows duplicate elements and also maintains the insertion order, Set interface doesn't allow duplicate elements. Map interface represents a collection of key-value pairs, where each key is unique and can be used to retrieve its corresponding value.

Arrays
>* collection of objects, where the type and number of objects are specified upfront
>* fixed-length characteristic

List
>* ordered collection of objects, can contain duplicate

ArrayList
>* specific implementation of a list where arrays are used to stored elements

Interface Hierarchy
>* Iterable > Collection > List

Linked List
>* implements the list using a double-linked list
>* Collection interface represents a group of objects, known as its elements. List and Set interfaces extends Collection, List interface allows duplicate elements and also maintains the insertion order, Set interface doesn't allow duplicate elements. Map interface represents a collection of key-value pairs, where each key is unique and can be used to retrieve its corresponding value.

Sets
>* unordered collection of elements which do not allow duplicates
>* Sets used equality checks to performed using the .equals() and .hashCode() method on objects.

HashSet
>* set elements in random order

LinkHashSet
>* order elements the way it inserted to the set.

TreeSet
>* set elements in lexicographic order(alphabetical) or in ascending order

Comparing Elements in a TreeSet'
>* Objects implement the Comparable interface or the TreeSet uses a separate Comparator

Maps
>* containers that contain mappings from keys to values

Cache
>* Smaller sized faster store for quick look ups of commonly used data

LRU(Least Recently Used Cached)
>* keeps around data that is frequently accessed and evicts data that is rarely accessed 



