public class StackQueue {
    private int[] data;
    private int size;       // Количество элементов в структуре
    private int front;      // Индекс начала очереди
    private int top;        // Индекс вершины стека (для удобства)

    public StackQueue(int capacity) {
        data = new int[capacity];
        size = 0;
        front = 0;
        top = -1;
    }

    // --- Методы стека ---

    // Добавить элемент на вершину стека
    public void push(int value) {
        if (size == data.length) {
            throw new RuntimeException("Структура данных заполнена");
        }
        top++;
        data[top] = value;
        size++;
    }

    // Удалить и вернуть элемент с вершины стека
    public int pop() {
        if (top < 0) {
            throw new RuntimeException("Стек пуст");
        }
        int value = data[top];
        top--;
        size--;
        return value;
    }

    // --- Методы очереди ---

    // Добавить элемент в конец очереди
    public void enqueue(int value) {
        if (size == data.length) {
            throw new RuntimeException("Структура данных заполнена");
        }
        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;
    }

    // Удалить и вернуть элемент из начала очереди
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Очередь пуста");
        }
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    // --- Дополнительно ---

    // Проверка, пуст ли стек
    public boolean isStackEmpty() {
        return top < 0;
    }

    // Проверка, пуст ли очередь
    public boolean isQueueEmpty() {
        return size == 0;
    }
}
