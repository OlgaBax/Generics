package ru.bainc.main.paramClass;

public class GenMethodDemo {
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6};
        if (isIn(2,intArray)){
            System.out.println("Элемент 2  входит в массив");
        }
        if (!isIn(7,intArray)){
            System.out.println("Элемент 7 не входит в массив");
        }

        String [] strArray = {"privet", "poka", "kak dela"};
        if (isIn("privet", strArray)){
            System.out.println("Элемент privet входит в массив");
        }
        if(!isIn("drug", strArray)){
            System.out.println("Элемент drug не входит в массив");
        }

    }
    /**
     * метод определяет является ли объект элементом массива
     *
     * @param x
     * @param array
     * @param <T>
     * @param <V>
     * @return true или false
     */
    public static <T, V> boolean isIn(T x, V[] array) {
        for (V element : array) {
            if (x.equals(element)) {
                return true;
            }
        }
        return false;
    }
}