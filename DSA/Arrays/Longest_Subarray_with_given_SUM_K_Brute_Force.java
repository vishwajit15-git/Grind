maxi = 0;

for(int i = 0; i < n; i++) {
    for(int j = i; j < n; j++) {
        int sum = 0;

        for(int k = i; k <= j; k++) {
            sum += nums[k];
        }

        if(sum == K) {
            maxi = Math.max(maxi, j - i + 1);
        }
    }
}