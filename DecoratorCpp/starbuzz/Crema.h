#pragma once
#include "Condimento.h"

class Crema : public Condimento {
public:
	Crema();
	Crema(Condimento* wrappee);
};
