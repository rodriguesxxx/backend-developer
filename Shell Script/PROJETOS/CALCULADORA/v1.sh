#!/usr/bin/env bash

### DEFINES ###
BASIC_INIT_SCRIPT_PATH="./basic/init.sh"

### IMPORT VALIDATIONS ###
if [[ ! -e $BASIC_INIT_SCRIPT_PATH ]]; then
    echo "error >>> The basic/init.sh is necessary, install the calculator again."
    exit 1
fi

### IMPORTS ###
source $BASIC_INIT_SCRIPT_PATH

call_calculator() {

    local type=$1

    if [[ $type -eq 1 ]]; then
        basic
    elif [[ $type -eq 2 ]]; then
        echo "call advanced calculator"
    elif [[ $type -eq 3 ]]; then
        echo "call programming calculator"
    else
        echo "error >>> Invalid choice!"
        exit
    fi
}

v1() {
    
    clear
    
    echo -e \
    "
    \t\t\tTHE CALCULATOR
    Choose the calculator type:
        1 : Basic
        2 : Advanced
        3 : Programming
    ->"

    read type
    call_calculator $type
}

v1