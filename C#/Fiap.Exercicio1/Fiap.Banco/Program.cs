using Fiap.Banco.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Banco
{
    class Program
    {
        static void Main(string[] args)
        {
            ContaCorrente contaCorrente = new ContaCorrente();
            contaCorrente.Agencia = 1382;
            contaCorrente.DataAbertura = DateTime.Now;
            contaCorrente.Numero = 6541;
            contaCorrente.Saldo = 1000;
            contaCorrente.Tipo = TipoConta.Comum;

            contaCorrente.Depositar(1000);

            contaCorrente.Retirar(3000);
        }
    }
}
