#pragma once
#include "Condimento.h"


class Chocolate : public Condimento {
public:
	Chocolate();
	Chocolate(Condimento* wrappee);
};