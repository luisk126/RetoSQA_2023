# luis carlos benavides
# fecha: 5 de octubre 2023
# luisca.bc123@gmail.com
# language: es


  Característica: El usuario desea realizar una compra de productos de flores y poder eliminar

    @Escenari01
    Escenario: Seleccionar dos prodcutos de la categoria amor para agregar al carro de compras
      Dado que el usuario ingresa a la plataforma de la floristeria mundo amor
      Y que el usuario ingresa a la categoria amor
      Entonces valida si esta en el modulo Amor
      Y da click en el pimer producto para agregar en el carrito de comprar
      Entonces valida si esta en el modulo Carrito
      Y da click a la categoria Amor
      Y da click en el segundo producto para agregar en el carrito de comprar
      Entonces valida los productos en el carrito
