
README.md
# Drone Navigation System using Brute-Force Convex Hull

## Description

This project demonstrates how a drone identifies the boundary points of obstacles using the Brute-Force Convex Hull Algorithm.

## Features

- Finds outer boundary points
- Simple Java implementation
- Demonstrates computational geometry
- Suitable for educational purposes

## Algorithm

1. Choose every pair of points.
2. Check whether all other points lie on the same side.
3. If yes, both points belong to the convex hull.
4. Print all hull points.

## Time Complexity

O(n³)

## Space Complexity

O(n)

## Input

```
(0,3)
(2,2)
(1,1)
(2,1)
(3,0)
(0,0)
(3,3)
```

## Output

```
Convex Hull Points
(0,3)
(3,3)
(3,0)
(0,0)
```

## Applications

- Drone navigation
- Robotics
- GIS
- Computer Graphics
- Object boundary detection

## Author

Asif