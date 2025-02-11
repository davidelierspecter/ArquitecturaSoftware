#include "HouseBlend.h"

HouseBlend::HouseBlend() : BebidaDecorable() {
	costoBase = 100.f;
}

HouseBlend::HouseBlend(Condimento* condimento) : BebidaDecorable(condimento){
	costoBase = 100.f;
}