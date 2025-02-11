#pragma once
#include "Condimento.h"

class Leche : public Condimento {
public:
	Leche();
	Leche(Condimento* wrappee);
};


