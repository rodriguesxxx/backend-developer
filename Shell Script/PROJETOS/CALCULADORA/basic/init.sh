#!/usr/bin/env bash

### DEFINES ###
OPERATIONS_SCRIPT_PATH="./basic/operations.sh"

### IMPORT VALIDATIONS ###
if [[ ! -e $OPERATIONS_SCRIPT_PATH ]]; then
    echo "error >>> The basic/operations.sh is necessary, install the calculator again."
    exit 1
fi

### IMPORTS ###
source $OPERATIONS_SCRIPT_PATH

call_operation() {
    local op=$1
    
    if [[ "$op" = "+" ]]; then
        echo "call sum op"
    elif [[ "$op" = "-" ]]; then
        echo "call sub op"
    elif [[ "$op" = "*" ]]; then
        echo "call mult op"
    elif [[ "$op" = "/" ]]; then
        echo "call div op"
    else
        echo "error >>> Invalid choice!"
        exit 1
    fi
}

basic() {
    clear
    
    echo -e \
    "
    \t\t\tTHE CALCULATOR - BASIC
    Choose the operation:
        + : sum
        - : sub
        * : mult
        / : div 
    ->
    "
    read op
    call_operation $op
}
