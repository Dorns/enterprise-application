using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Banco.Model
{
    class ContaPoupanca : Conta, IContaInvestimento
    {
        public decimal Taxa { get; set; }

        private readonly decimal _rendimento;

        public ContaPoupanca(decimal rendimento)
        {
            _rendimento = rendimento;
        }

        public override void Retirar(decimal valor)
        {
            if (Saldo < valor + Taxa)
            {
                throw new Exception("Saldo Insuficiente");
                
            }
            Saldo -= valor + Taxa;
        }

        public override void Depositar(decimal valor)
        {
            Saldo += valor;
        }

        public decimal CalculaRetornoInvestimento()
        {
            return Saldo * _rendimento;
        }
    }
}
