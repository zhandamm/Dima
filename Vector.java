package DimaHelp;


import java.util.Arrays;

public class Vector {
    int[] elements = {1, 2, 3, 4};


    public int getElement(int index) {
        return elements[index];
    }

    public void setDimension(int dim) {
        elements = new int[dim];

    }

    public void setElements(int index, int value) {
        this.elements[index] = value;
    }

    Vector multiply(Vector vector) {

        for (int i = 1; i < vector.elements.length; i++) {
            vector.elements[i - 1] *= vector.elements[i];
        }
        return vector;
    }

    Vector divide(Vector vector) {

        for (int i = 1; i < vector.elements.length; i++) {
            vector.elements[i - 1] /= vector.elements[i];
        }
        return vector;
    }

    Vector deduct(Vector vector) {

        for (int i = 1; i < vector.elements.length; i++) {
            vector.elements[i - 1] -= vector.elements[i];
        }
        return vector;
    }

    Vector add(Vector vector) {

        for (int i = 1; i < vector.elements.length; i++) {
            vector.elements[i - 1] += vector.elements[i];
        }
        return vector;
    }

    void print() {
        System.out.println(Arrays.toString(elements));
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();


    }
}
