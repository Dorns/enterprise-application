using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Fiap.Exemplo04.MVC.Models
{
    public class Jogador
    {
        public int JogadorId { get; set; }

        [Required]
        [StringLength(200, ErrorMessage = "O Máximo de Caractéres é de 200")]
        public string Nome { get; set; }

        [Required]
        [DataType(DataType.DateTime, ErrorMessage = "Data Inválida")]
        public DateTime DataNascimento { get; set; }

        //Relacionamentos
        public Time Time { get; set; }

        [Required]
        public int TimeId { get; set; }
    }
}