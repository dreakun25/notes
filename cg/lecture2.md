# Polygonal Model

- Oldest and most known model for graphical presentation
- Resolution &rarr; Number of polygons
- More polygons mmore data for storage
- Model is saved in many resolutions for use in different cases
- Smallest polygon is a triangle
- Polygons are defined by vertexes (at least three)
- Vertex is defined by $x$,$y$,$z$ coordinates
- Distance between two vertexes is a Vector $\|V\|=\sqrt{dx^2+dy^2+dz^2}$
- To make two vectors with an angle $\alpha$ between them into a triangle we need a vertical vector with its vertex, it is calculated so: $\|V\|=\|V_1\|*\|V_2\|*\cos(\alpha)$
- The normal vector of a vertex is the vector that is vertical to the surface of the vertex
- If we want a normal for a vertex with more than one vector we calculate the vertical vectors in pairs (e.g. 4 vectors from one vertex &rarr; $V_{12}$, $V_{23}$, $V_{34}$ and $V_{41}$)

## Simple Polygonal Model

- Is comprised of three triangles at least and has a Face Table and Vertex Table

### Face Table

| Faces | Vectors           |
| ----- | ----------------- |
| $F_1$ | $V_1$ $V_2$ $V_3$ |
| $F_2$ | $V_2$ $V_3$ $V_4$ |
| $F_3$ | $V_2$ $V_4$ $V_5$ |

### Vector Table

| Vector | Vertexes          |
| ------ | ----------------- |
| $V_1$  | $x_1$ $y_1$ $z_1$ |
| $V_2$  | $x_2$ $y_2$ $z_2$ |
| $V_3$  | $x_3$ $y_3$ $z_3$ |
