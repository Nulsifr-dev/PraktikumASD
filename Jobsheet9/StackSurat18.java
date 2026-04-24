package Jobsheet9;

public class StackSurat18 {
    Surat18[] stack;
    int top, size;

    public StackSurat18(int size) {
        this.size = size;
        stack = new Surat18[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat18 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah surat.");
        }
    }

    public Surat18 pop() {
        if (!isEmpty()) {
            Surat18 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public Surat18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat18 cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(
                stack[i].idSurat + "\t" +
                stack[i].namaMahasiswa + "\t" +
                stack[i].kelas + "\t" +
                stack[i].jenisIzin + "\t" +
                stack[i].durasi
            );
        }
    }
    
}
