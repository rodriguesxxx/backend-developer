#!/usr/bin/env bash

if [[ 10 -eq 10 ]]; then
    echo "EH IGUAL"
else
    echo "NÃO EH IGUAL"
fi

if [[ 10 -gt 11 ]]; then
    echo "EH MAIOR"
else
    echo "NÃO EH MAIOR"
fi

if [[ 11 -ge 11 ]]; then
    echo "EH MAIOR OU IGUAL"
else
    echo "NÃO EH MAIOR NEM IGUAL"
fi

if [[ 10 -lt 11 ]]; then
    echo "EH MENOR"
else
    echo "NÃO EH MENOR"
fi

if [[ 10 -le 11 ]]; then
    echo "EH MENOR OU IGUAL"
else
    echo "NÃO EH MENOR"
fi