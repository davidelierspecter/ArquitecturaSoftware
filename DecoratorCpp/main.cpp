#include <iostream>
#include "starbuzz/Condimento.h"
#include "starbuzz/BebidaDecorable.h"
#include "starbuzz/Expresso.h"
#include "starbuzz/Leche.h"
#include "starbuzz/Soya.h"
#include "starbuzz/Crema.h"
#include "starbuzz/Chocolate.h"
#include "starbuzz/Decaf.h"
#include "starbuzz/HouseBlend.h"


int main() {

	BebidaDecorable* houseBlend = new HouseBlend(new Leche(new Soya(new Crema(new Chocolate()))));
	houseBlend->imprimirCostos();

	return 0;
}