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
            var contaCorrente = new ContaCorrente
            {
                Agencia = 1382,
                DataAbertura = DateTime.Now,
                Numero = 6541,
                Saldo = 1000,
                TipoConta = TipoConta.Comum
            };
            contaCorrente.Depositar(1000);

            contaCorrente.Retirar(2000);

            var contaPoupanca = new ContaPoupanca(10)
            {
                Agencia = 1382,
                DataAbertura = DateTime.Now,
                Numero = 6541,
                Saldo = 500,
                Taxa = 10                
            };

            contaPoupanca.Depositar(2000);
            contaPoupanca.Retirar(1000);
            Console.WriteLine(contaPoupanca.CalculaRetornoInvestimento());
            Console.ReadLine();
        }
    }
}
