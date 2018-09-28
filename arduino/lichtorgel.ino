//Anschlüsse benennen
int GELB = 12;
int ROT = 11;
int PIEP = 10;

/**
 * Anschlüsse einrichten
 */
void setup() {
  
  // put your setup code here, to run once:
  pinMode(GELB, OUTPUT);
  pinMode(ROT, OUTPUT);
  pinMode(PIEP, OUTPUT);

}

/**
 * Das Hauptprogramm
 */
void loop() {

 lichtorgel(true);
  
}

/**
 * Lichtorgel
 */
void lichtorgel(boolean an) {

  if (an) {
    
    blinken(GELB, 100);
    blinken(ROT,  200);
    blinken(PIEP, 300);
  }

}


/**
 * Blinkt für eine gewisse Zeit
 */
void blinken(int led, int zeit) {
  
  digitalWrite(led, HIGH);
  delay(zeit);
  digitalWrite(led, LOW);
  //delay(zeit);

}


