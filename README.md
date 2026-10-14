# Sistema de Notificaciones — Patrón Factory
Sistema de notificaciones que permite enviar mensajes por correo electrónico, SMS y WhatsApp, implementado en Java con el patrón de diseño Factory.

El usuario elige el tipo de notificación (`email`, `sms` o `whatsapp`) y `NotificationService` se lo pide a `SimpleNotificationFactory`, que crea el objeto concreto correspondiente. El servicio solo conoce la interfaz `Notification`, por lo que no depende de ninguna clase concreta y no necesita cambios cuando se agrega un nuevo canal.

## Salida en pantalla
<img width="535" height="54" alt="image" src="https://github.com/user-attachments/assets/0374df58-5b56-48d5-a448-20c716263f20" />
