#include "BebidaDecorable.h"
#include <iostream>

BebidaDecorable::BebidaDecorable() {
	condimentos = nullptr;
	std::cout << "Bebida creada, condimentos = nullptr" << std::endl;
}

BebidaDecorable::BebidaDecorable(Condimento* condimento){
	condimentos = condimento;
	std::cout << "Bebida creada con condimento" << std::endl;
}

void BebidaDecorable::imprimirCostos() {
	std::cout << "Costo base de la bebida: " << costoBase << std::endl;
	if (condimentos) condimentos->imprimirCostoDelCondimento();
	std::cout << std::endl;
}
