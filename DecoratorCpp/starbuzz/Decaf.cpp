#include "Decaf.h"

Decaf::Decaf() : BebidaDecorable() {
	costoBase = 80.f;
}

Decaf::Decaf(Condimento* condimentos) : BebidaDecorable(condimentos) {
	costoBase = 80.f;
}