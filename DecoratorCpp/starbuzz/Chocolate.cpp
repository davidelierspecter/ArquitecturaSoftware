#include "Chocolate.h"

Chocolate::Chocolate() : Condimento() {
	costo = 40.f;
	nombre = "Chocolate";
}

Chocolate::Chocolate(Condimento* wrappee) : Condimento(wrappee) {
	costo = 40.f;
	nombre = "Chocolate";
}