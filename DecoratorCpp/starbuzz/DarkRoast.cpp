#include "DarkRoast.h"

DarkRoast::DarkRoast() : BebidaDecorable() {
	costoBase = 90.f;
}

DarkRoast::DarkRoast(Condimento* condimentos) : BebidaDecorable(condimentos) {
	costoBase = 90.f;
}