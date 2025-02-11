#include "Crema.h"

Crema::Crema() : Condimento(){
	costo = 30.f;
	nombre = "Crema";
}

Crema::Crema(Condimento* wrappee) : Condimento(wrappee) {
	costo = 30.f;
	nombre = "Crema";
}