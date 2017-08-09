using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Banco.Model
{
    sealed class ContaCorrente : Conta
    {
        public TipoConta Tipo { get; set; }
  
        public override void Retirar(decimal valor)
        {
            if (Tipo.Equals("Comum") && (Saldo - valor < 0)) 
            {
                throw new ArgumentException("Saldo Insuficiente");
            }
        }
    }
}
