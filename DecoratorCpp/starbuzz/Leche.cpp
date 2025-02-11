#include "Leche.h"

Leche::Leche(): Condimento() {
	costo = 15.f;
	nombre = "Leche";
}

Leche::Leche(Condimento* wrappee): Condimento(wrappee) {
	costo = 15.f;
	nombre = "Leche";
}
