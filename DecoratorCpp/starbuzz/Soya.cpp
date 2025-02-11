#include "Soya.h"

Soya::Soya() : Condimento(){
	costo = 10.f;
	nombre = "Soya";
}

Soya::Soya(Condimento* wrappee) : Condimento(wrappee) {
	costo = 10.f;
	nombre = "Soya";
}
