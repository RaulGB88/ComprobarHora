/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    public static final int HOR = 10;
    public static final int MIN = 25;
    public static final int SEG = 43;

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        boolean horaOK = HOR >= 0 && HOR <= 23 && MIN >= 0 && MIN <= 59 && SEG >= 0 && SEG <= 59;

        if (horaOK) {
            System.out.printf("La hora %02d:%02d:02%d SI es correcta\n", HOR, MIN, SEG);
        } else {
            System.out.printf("La hora %02d:%02d:%02d NO es correcta\n", HOR, MIN, SEG);
        }
    }

}
