### Actividad 2 PSP Manual de uso
## Moisés Ortiz

En este pequeño manual se explicará el funcionamiento de cada aplicación con ejemplos gráficos, primero la aplicación **leerTexto** la cuál lee un archivo a través de una dirección establecida y lo devuelve **AVISO, LA APLICACIÓN leerTextoo USA UNA RUTA ABSOLUTA, RECUERDA CAMBIAR EL CÓDIGO A TU PROPIA RUTA**:
<p align="center">
<img width="683" height="447" alt="imagen" src="https://github.com/user-attachments/assets/676c2758-def6-4548-834c-bc62fea87d99" />
</p>  
Tras esto, la aplicación **filtraLineas** la cuál recibe una entrada de texto estándar y solo imprime las líneas que contengan 20 o más carácteres, para comprobar su funcionamiento nos servimos de **leerTexto** usando una tubería:
<p align="center">
<img width="671" height="412" alt="imagen" src="https://github.com/user-attachments/assets/7ace494c-2472-4df0-94fc-add259635264" />
</p>  
Por último, la aplicación **contarPalabras** que devolverá el número de palabras que haya recibido a través de su entrada estándar, de nuevo se vuelve a usar la aplicación **leerTexto** para obtener una entrada:
<p align="center">
<img width="673" height="413" alt="imagen" src="https://github.com/user-attachments/assets/7c183435-b116-4b1e-84d2-334e0767e2f8" />
</p>  
Y aquí se deja un ejemplo del uso de las tres aplicaciones a través de tuberías, donde se puede ver que el resultado varía puesto que se filtra la última línea del documento:
<p align="center">
<img width="673" height="411" alt="imagen" src="https://github.com/user-attachments/assets/42e9f438-6539-4388-bdc7-a2b495011bac" />
</p>
