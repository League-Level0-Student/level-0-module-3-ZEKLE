void setup() {
  size(600, 600); 
  background(0, 255, 0);
}

void draw() {
  for (int i = 1000; i > 0; i--) {
    if (i % 2 == 0) {
      fill(100, 0, 0);
      System.out.println();
    } else {
       fill(255, 0, 0);
    }
    ellipse(275, 300, i*10, i*10);
    
  }
}
