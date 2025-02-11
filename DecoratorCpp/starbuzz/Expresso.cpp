#include "Expresso.h"

Expresso::Expresso(): BebidaDecorable() {
	costoBase = 110.f;
}

Expresso::Expresso(Condimento* condimento): BebidaDecorable(condimento) {
	costoBase = 110.f;
}
