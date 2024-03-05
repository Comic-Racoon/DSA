package A2Z._01_Basics._03_Collection_In_Java;

public class _01_Collection_FrameWork {

    /*
    1) Collection (Interface)
        a) If we want to represent a group of individual object as a single entity then we
           should go for collection.
        b) Collection interface defines the most common method which are applicable for any
           collection object.
        c) In general collection interface is consider as root interface of collection framework.
        d) There is no concrete class which implement collection interface directly.

        Collection vs collections
            I.  Collection is an interface if we want to represent a group of individual object as a
                single entity then we should go for collection.
            II. Collections is a utility class present in java.util package to define several utility
                method for collection object like sorting, searching etc.

    2) List(interface)
        a) It is the child interface of collection.
        b) If we want to represent a group of individual object as a single entity where
           duplicate are allow and insertion order must be persevered then we should go for
           list.
           |- Arraylist
           |- Linklist
           |- Vector
           |- Stack

    3) Set
        a) It is the child interface of collection.
        b) If we want to represent a group of individual object as a single entity where
           duplicate are not allowed and insertion order not required then we should go for
           set interface.
           |- Hashset
           |- Linked HashSet

           SortedSet(interface)
                a) It is the child interface of set.
                b) If we want to represent a group of individual object as a single entity where
                   duplicate are not allowed and all object should be inserted according to some
                   sorting order then we should go for sortedset.

                NavigableSet(interface)
                    a) It is the child interface of sorted set it contain several method for navigation purpose.

            |- Sorted Set
            |- NavigableSet
            |- Tree Set

    4) Queue(interface)
        a) It is the child interface of collection.
        b) If we want to represent a group of individual object prior to processing then we
           should go for queue.
        c) Usually queue follows FIFO order but based on our requirement we can implement
           our own priority order also.

           Queue
           |- Priority Queue
           |- Blocking Queue
                |- Priority Blocking Queue
                |- Linked Blocking Queue

Note -
    a) All the above interface (collection, list, sortedset, navigableset and queue) meant for
       representing a group of individual object.
    b) If we want to represent a group of object as key value pairs then we should go for map.


    5) Map
        a) Map is not child interface of collection.
        b) If we want to represent a group of object as key value pairs then we should go for
           map.
            |- Hashmap
                |- Lined HashMap
            |- Weak HashMap
            |- Identity HashMap
            |- HashTables
                |- Dictionary
                |- Properties
        SortedMap
            a) It is the child interface of map.
            b) If we want to represent a group of key value pairs according to some sorting order
               of keys then we should go for sorted map.
            c) In sorted map the sorting should be based on key but not based on value.

        NavigableMap
            a) It is the child interface of sortedmap.
            b) It defined several method for navigation purpose.
            |- Sorted Map
            |- Navigable Map
            |- Tree Map

The following are legacy character present in collection framework
1. Enumeration(interface)
2. Dictionary(abstract class)
3. Vector(class)
4. Stack(class)
5. Hashtable(class)
6. Properties(class)

     */
}
