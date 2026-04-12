package Praktikum05;

public class Nilai {
    int uts[];
    int uas[];

    Nilai(int n) {
        uts = new int[n];
        uas = new int[n];
    }

    int maxUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        int leftMax = maxUTS(arr, l, mid);
        int rightMax = maxUTS(arr, mid + 1, r);

        return Math.max(leftMax, rightMax);
    }

    int minUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        int leftMin = minUTS(arr, l, mid);
        int rightMin = minUTS(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    double rataUAS() {
        int total = 0;

        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }

        return (double) total / uas.length;
    }
    
}
