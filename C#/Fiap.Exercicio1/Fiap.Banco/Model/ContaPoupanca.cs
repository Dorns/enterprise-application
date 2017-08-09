using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Banco.Model
{
    class ContaPoupanca : Conta, IContaInvestimento
    {
        private decimal Taxa { get; set; }

        private readonly decimal _rendimento;

        public ContaPoupanca(decimal valorInicial)
        {
            _rendimento = valorInicial;
        }
        public decimal CalculaRetornoInvestimento
        {
            get
            {
                return Saldo * _rendimento;
            }
        }

        public override void Retirar(decimal valor)
        {
            if (Saldo - valor < 0)
            {
                Saldo = Saldo - valor * Taxa;
            }
            else
            {
                throw new ArgumentException("Saldo Insuficiente");
            }
        }
    }
}
