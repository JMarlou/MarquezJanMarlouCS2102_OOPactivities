# **Mindful Reflections: A Stress Relieving Program**

## I. Project Overview
Mindful Reflections is a wellness console program that utilizes different activities based on research in relieving stress and promoting mental well being whilst adding a spice of gamification.

## II. Application of OOP Principles


1. Encapsulation:
    By using private instance variables (name and duration), we hide the internal details of the Activity class from outside access. This ensures that these variables can’t be changed directly, which helps prevent unintended modifications. The getter methods (getName(), getDuration()) offer controlled access to these private variables. This allows users to interact with the object’s state only in predefined, safe ways, promoting data integrity.

2. Abstraction:
    The Activity class provides a general template for all activities, offering a set of common behaviors (e.g., displaying info, waiting for Enter). However, it abstracts away the specific details of how an activity is performed.
    
    The performActivity() method is abstract, meaning subclasses like BodyScanMeditation, BoxBreathing, Visualization, and PhysicalExercise must implement their own version of the method. This allows to define specific behaviors for different activities while still following a general structure.

3. Inheritance:
    All the subclasses of Activity inherits common properties and methods, such as the name, duration, and displayInfo(). This promotes code reuse and avoids duplication.

4. Polymorphism:
    Polymorphism shines when you deal with different types of activities (BodyScanMeditation, BoxBreathing, Visualization, and PhysicalExercise). We can treat all these subclasses as instances of the Activity class and call their performActivity() methods without needing to know the exact type of activity at compile time. This allows me to write more generic, reusable code that can handle any kind of activity, while the specific behavior is determined at runtime. 
    
## III. Integration of the Sustainable Development Goal (SDG)
This project promotes the same goal as SDG 3: Good Health and Well-Being. Through the console program, users are able to do activities and techniques that promotes well-being that is essential to sustainable development.

## IV. Instructions for running the program
This program can be copied to your preferred coding application that uses JAVA program or is directly run through codespaces.